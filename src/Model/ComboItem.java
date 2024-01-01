/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class ComboItem {
    private Integer key;
    private String value;

    public ComboItem(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    
    
    
    
}
