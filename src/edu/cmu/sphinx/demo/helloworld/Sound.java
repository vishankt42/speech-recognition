/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cmu.sphinx.demo.helloworld;

import com.sun.speech.freetts.*;
import java.io.* ;
import java.util.Calendar;
public class Sound {
        private String speaktext;
public void dospeak(String speak,String voice)
{
speaktext=speak; 
try
{
VoiceManager voiceManager=VoiceManager.getInstance();
Voice voices=voiceManager.getVoice(voice);
Voice voices1[]=voiceManager.getVoices();
//System.out.println("Available Voices");
//for(int i=0;i<voices1.length;i++)
//System.out.println(voices1[i].getName());
Voice sp=null;
if(voices!=null)
{
sp=voices; 
}
else
{
System.out.println("No Voice Available");
}
sp.allocate();
sp.speak(speaktext);
sp.deallocate();
}
catch(Exception e)
{
e.printStackTrace();
}
}

public Sound()
{
      String name=null;
//int value=0;
Calendar c = Calendar.getInstance();
int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

if(timeOfDay >= 0 && timeOfDay < 12){
        name = "good morning sir" ; 
}else if(timeOfDay >= 12 && timeOfDay < 16){
     name = "good afternoon sir" ; 
}else if(timeOfDay >= 16 && timeOfDay < 21){
    name = "good evening sir" ; 
}else if(timeOfDay >= 21 && timeOfDay < 24){
     name = "good gudnight sir" ; 
}


dospeak(name,"kevin16");

 
}
    }

