/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import dataBase.object.Member;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anadidathorion
 */
public class MemberManager {
    private static List<Member> members;
    
    private MemberManager() {
        
    }
    
    public static void init() {
        members = new ArrayList<>();
        populate();
        // Find objects in DB
    }
    
    public static int size() {
        return members.size();
    }
    
    public static List<Member> getMember() {
        return members;
    }
    
    private static void populate() {
        members.add(new Member("Valérian", "Perez", "Anih", "a@a.com", "0123456789", "plop"));
        members.add(new Member("Fabien", "Perot", "Présicarré", "a@a.com", "0123456789", "plop"));
        members.add(new Member("Léa", "Perronet", "Loge", "a@a.com", "0123456789", "plop"));
        members.add(new Member("Lucas", "plop", "Anih", "a@a.com", "0123456789", "plop"));
        members.add(new Member("Owen", "Plop", "Anih", "a@a.com", "0123456789", "plop"));
    }
}
