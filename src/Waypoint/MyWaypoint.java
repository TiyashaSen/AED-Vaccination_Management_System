/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Waypoint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author tiyashasen
 */
public class MyWaypoint extends DefaultWaypoint {
    
    public MyWaypoint(){
        
    }
    
    public MyWaypoint(String name,  GeoPosition coord){
        super(coord);
        this.name=name;
        initButton();
    }
    
    private String name;
    private JButton button;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
    
    private void initButton(){
        button=new ButtonWaypoint();
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println("Click" +name);
            }
        });
    }
    
    
    
}
