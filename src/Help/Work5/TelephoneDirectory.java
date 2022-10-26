/* Current file: TelephoneDirectory.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work5;

import java.io.*;
import java.util.*;

public class TelephoneDirectory {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        System.out.println("Telephone Directory Management System");
        System.out.println();
        System.out.println("1. Add person");
        System.out.println("2. Search by name");
        System.out.println("3. Sort Data");
        System.out.println("4. List of all people");
        System.out.println("5. Remove person");
        System.out.println("6. Exit");
        boolean quit = false;

        do {
            System.out.print("Please enter your choice: ");
            menu = scan.nextInt();
            System.out.println();

            switch (menu) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int ID = scan.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scan.next();
                    System.out.print("Enter Address: ");
                    String address = scan.next();
                    System.out.println("Enter Phone No: ");
                    String no = scan.next();
                    FileWriter fw = new FileWriter(new File("directory.txt"), true);
                    BufferedWriter out = new BufferedWriter(fw);
                    out.write(ID + " " + name + " " + address + " " + no);
                    out.newLine();
                    out.close();
                    break;
                case 2:
                    System.out.print("Enter name to search information: ");
                    String nameSearch = scan.next();
                    File f = new File("directory.txt");
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(
                                f));
                        String s;
                        while ((s = reader.readLine()) != null) {
                            String[] st = s.split(" ");
                            String nm = st[1];
                            String add = st[2];
                            String phoneNo = st[3];
                            if (nameSearch.equals(nm)) {
                                System.out
                                        .println("***********Information**************");
                                System.out.println("Address : " + add);
                                System.out.println("PhoneNo : " + phoneNo);
                            }
                        }
                        reader.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    File file = new File("directory.txt");
                    FileInputStream fstream = new FileInputStream(file);
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(in));

                    String strLine;
                    ArrayList<String> list = new ArrayList();

                    while ((strLine = br.readLine()) != null) {
                        list.add(strLine);
                    }

                    int j = 0;
                    Directory[] data = new Directory[list.size()];

                    try {
                        Iterator itr;
                        for (itr = list.iterator (); itr.hasNext (); ) {
                            String str = itr.next ().toString ();

                            String[] splitSt = str.split (" ");
                            String id = "";
                            String nn = "";
                            String add = "";
                            String pno = "";

                            for (int i = 0; i < splitSt.length; i++) {
                                id = splitSt[0];
                                nn = splitSt[1];
                                add = splitSt[2];
                                pno = splitSt[3];
                            }

                            data[j] = new Directory();
                            data[j].setId(Integer.parseInt(id));
                            data[j].setName(nn);
                            data[j].setAddress(add);
                            data[j].setPhoneNo(pno);
                            j++;
                        }

                        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                        Arrays.sort(data);
                        System.out.println("********Sorted by id********");
                        String strVal = "";
                        for (int i = 0; i < data.length; i++) {
                            Directory show = data[i];
                            int ide = show.getId();
                            String nnn = show.getName();
                            String add = show.getAddress();
                            String phone = show.getPhoneNo();
                            System.out.println(ide + " " + nnn + " " + add + " "
                                    + phone);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    FileInputStream fis = new FileInputStream(new File(
                            "directory.txt"));
                    DataInputStream dis = new DataInputStream(fis);
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(dis));
                    String st;
                    ArrayList al = new ArrayList();
                    while ((st = reader.readLine()) != null) {
                        al.add(st);
                    }
                    Iterator itr;
                    for (itr = al.iterator(); itr.hasNext();) {
                        String str = itr.next().toString();
                        String[] splitSt = str.split(" ");
                        String id = "";
                        String na = "";
                        String ada = "";
                        String ph = "";
                        for (int i = 0; i < splitSt.length; i++) {
                            id = splitSt[0];
                            na = splitSt[1];
                            ada = splitSt[2];
                            ph = splitSt[3];
                        }
                        System.out.println(id + " " + na + " " + ada + " " + ph);
                    }

                    break;
                case 5:
                    System.out.println("Enter the id to remove: ");
                    int idSearch = scan.nextInt();
                    ArrayList<String> lines = new ArrayList<>();
                    FileInputStream fi = new FileInputStream(new File(
                            "directory.txt"));
                    DataInputStream di = new DataInputStream(fi);
                    BufferedReader readr = new BufferedReader(
                            new InputStreamReader(di));
                    String str;
                    ArrayList arl = new ArrayList();
                    while ((st = readr.readLine()) != null) {
                        arl.add(st);
                    }
                    Iterator iter;
                    for (iter = arl.iterator(); iter.hasNext();) {
                        String strng = iter.next().toString();
                        String[] splitSt = strng.split(" ");
                        String id = "";
                        for (int i = 0; i < splitSt.length; i++) {
                            id = splitSt[0];
                        }
                        if(Integer.parseInt(id) != idSearch){
                            lines.add(strng);
                        }
                    }
                    PrintWriter writer = new PrintWriter("directory.txt");
                    writer.close();

                    FileWriter fwr = new FileWriter(new File("directory.txt"), true);
                    BufferedWriter fout = new BufferedWriter(fwr);
                    for(String  string : lines){
                        fout.write(string);
                        fout.newLine();
                    }
                    fout.close();

                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Entry!");
            }
        } while (!quit);
    }
}
