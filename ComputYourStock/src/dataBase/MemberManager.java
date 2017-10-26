/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import dataBase.object.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Anadidathorion
 */
public class MemberManager {
    private static Map<String, Member> members;
    
    private MemberManager() {
        
    }
    
    public static void init() {
        members = new HashMap<>();
        populate();
        // Find objects in DB
    }
    
    public static int size() {
        return members.size();
    }
    
    public static List<Member> getMember() {
        return new ArrayList<Member>( members.values());
    }
    
    private static void populate() {
        Member tmp = new Member("Valérian", "Perez", "Anih","000001", "a@a.com", "0123456789", "plop");
        members.put(tmp.getCode(), tmp);
        tmp = new Member("Fabien", "Perot", "Présicarré","000002", "a@a.com", "0123456789", "plop");
        members.put(tmp.getCode(), tmp);
        tmp = new Member("Léa", "Perronet", "Loge","000003", "a@a.com", "0123456789", "plop");
        members.put(tmp.getCode(), tmp);
        tmp = new Member("Lucas", "plop", "Acul","000004", "a@a.com", "0123456789", "plop");
        members.put(tmp.getCode(), tmp);
        tmp = new Member("Owen", "Plop", "Owen","000005", "a@a.com", "0123456789", "plop");
    }
}
