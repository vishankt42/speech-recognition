/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cmu.sphinx.demo.helloworld;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
public class HelloWorld{

   static String resultText;
   // static String args[];`
    public static void main (String...args) {
       TestPanel tp=new TestPanel();
         tp.setVisible(true); 
         Sound s=new Sound();
         
        
        ConfigurationManager cm;
        
         
        
       
	        if (args.length > 0) {
	            cm = new ConfigurationManager(args[0]);
	        } else {
	            cm = new ConfigurationManager(HelloWorld.class.getResource("helloworld.config.xml"));
	        }

	        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
	        recognizer.allocate();

	        // start the microphone or exit if the programm if this is not possible
	       Microphone  microphone = (Microphone) cm.lookup("microphone");
	        if (!microphone.startRecording()) {
	            System.out.println("Cannot start microphone.");
	            recognizer.deallocate();
	            System.exit(1);
	        }
	        System.out.println("Say: (Good morning | Hello) ( Robin | Rita | Philip | Martin | Edward | Aunty )");
              
	   
                  
	        while (true) {
                    
          //TestPanel tp=new TestPanel();
            //tp.setVisible(true);
                       
                
	            System.out.println("Start speaking. Press Ctrl-C to quit.\n");

	            Result result = recognizer.recognize();
                     //TestPanel tp=new TestPanel();
                        //tp.setVisible(true);
	            if (result != null) {
                        
	               resultText = result.getBestFinalResultNoFiller();
                          
                        tp.vishu.setText(resultText);
                
                                        
	               System.out.println("You said: " + resultText + '\n');
	            }   if(resultText.equalsIgnoreCase("close frame"))
 			{
                        try {
                        
                         tp.setVisible(false);
                        }catch(Exception e) {System.out.println(e);}
                        }
                    if(resultText.equalsIgnoreCase("open paint"))
 			{	
			try{
 				        Process p;
 				    	//resultText="";
 				        p = Runtime.getRuntime().exec("cmd /c start mspaint");
 				       // System.out.println("inside");
 				        }catch(Exception ae){}
 			}  
                    if(resultText.equalsIgnoreCase("close paint"))
 			{	 try{
 		        Process p;
 		    	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start taskkill /im mspaint.exe /f");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 			}
                    else if (resultText.equalsIgnoreCase("Open browser"))
 		    {
 		        try{
 		        Process p;//	resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start chrome.exe");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 		     }
                    if (resultText.equalsIgnoreCase("close Browser"))
 			    {
 			        try{
 			        Process p;//	resultText="";
 			        p = Runtime.getRuntime().exec("cmd /c start taskkill /im chrome.exe /f");
 			       // System.out.println("inside");
 			        }catch(Exception ae){}
 			     }
                    if(resultText.equalsIgnoreCase("site Robin"))
 			{	 try{
 		        Process p;
 		    	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start chrome www.facebook.com");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 			}
                    if(resultText.equalsIgnoreCase("site mail"))
 			{	 try{
 		        Process p;
 		    	//resultText="";
		        p = Runtime.getRuntime().exec("cmd /c start chrome https://mail.google.com");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 			}
                    if(resultText.equalsIgnoreCase("site go girl"))
 			{	 try{
 		        Process p;
 		    	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start chrome www.google.com");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 			}
                    if(resultText.equalsIgnoreCase("close program"))
 		    {
 				try{
 					System.out.println("Thanks for using !");
 					//recognizer.deallocate();
 					System.exit(0);}
 				catch(Exception ecomp ){}
 		    }
                    if(resultText.equalsIgnoreCase("Open command"))
 			{
 				try{
 				Process p;
 				//resultText="";
 				p = Runtime.getRuntime().exec("cmd /c start cmd");
 				//System.out.println("You said");
 				
 				 //resultText = result.getBestFinalResultNoFiller();
 				//System.out.println("You said: " + resultText + "\n");
 				
 				}catch(Exception er)
 				{}
 			}if (resultText.equalsIgnoreCase("close command"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
 		     
 		        }catch(Exception ae){}
 		    }
                        if (resultText.equalsIgnoreCase("Open calculator"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start calc");
 		     
 		        }catch(Exception ae){}
 		    }
                        if(resultText.equalsIgnoreCase("close calculator"))
 			{	 try{
 		        Process p;
 		    	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start taskkill /im calc.exe /f");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 	                }
                        
                        if(resultText.equalsIgnoreCase("Open task manager"))
 				{	 try{
 			        Process p;
 			    	//resultText="";
 			        p = Runtime.getRuntime().exec("cmd /c start taskmgr.exe");
 			       // System.out.println("inside");
 			        }catch(Exception ae){}
 				}
                        if(resultText.equalsIgnoreCase("close task manager"))
 				{	 try{
 			        Process p;
 			    	//resultText="";
 			        p = Runtime.getRuntime().exec("cmd /c start taskkill /im taskmgr.exe /f");
 			       // System.out.println("inside");
 			        }catch(Exception ae){}
 		              }
                        if (resultText.equalsIgnoreCase("open pad"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start notepad");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 		     }
 			 if (resultText.equalsIgnoreCase("close pad"))
 		    {
 		        try{
 		        Process p;	//resultText="";
 		        p = Runtime.getRuntime().exec("cmd /c start taskkill /im notepad.exe /f");
 		       // System.out.println("inside");
 		        }catch(Exception ae){}
 		     }
	        }
     
     
    }   
}
