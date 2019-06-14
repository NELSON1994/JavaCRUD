package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Connection connection;

        try {
            register reg = new register();
            connection con = new connection();
            connection = con.getConnection();
            if (connection != null) {

                Scanner input = new Scanner(System.in);

//user key in the inputs

                System.out.println("ENTER FIRST NAME");
                String firstname = reg.setFirstname(input.next());
                System.out.println("ENTER LAST NAME");
                String lastname = reg.setLastname(input.next());
                System.out.println("ENTER DATE OF BIRTH");
                String dob = reg.setDateofbirth(input.next());
                System.out.println("ENTER NATIONAL ID NUMBER");
                int id = reg.setNationalid(input.nextInt());
                System.out.println("ENTER INTER ID");
                int idd = reg.setId(input.nextInt());

                //Testing the user inputs

                System.out.println(firstname);
                System.out.println(lastname);
                System.out.println(dob);
                System.out.println(id);
                System.out.println(idd);

                //used to insert data to the database

                PreparedStatement preparedstatement;

                //creating the sql statement
                String sql;
                sql = "insert  into interns (FIRSTNAME,LASTNAME,ID,DOB,NATIONALID) VALUES ('" + firstname + "','" + lastname + "','" + id + "','" + dob + "','" + idd + "')";
                preparedstatement = connection.prepareStatement(sql);

                preparedstatement.executeUpdate();

                System.out.println("DETAILS SUCCESSFULLY INSERTED TO THE DATABASE");


                //register supervisor

                System.out.println("SUPERVISOR");
                System.out.println("SUPERVISOR");
                System.out.println("SUPERVISOR");


                System.out.println("ENTER SUPERVISOR FIRST NAME");
                String sfirstname = reg.setFirstname(input.next());
                System.out.println("ENTER  SUPERVISOR LAST NAME");
                String slastname = reg.setLastname(input.next());
                System.out.println("ENTER SUPERVISOR DATE OF BIRTH");
                String sdob = reg.setDateofbirth(input.next());
                System.out.println("ENTER SUPERVISOR NATIONAL ID NUMBER");
                int sid = reg.setNationalid(input.nextInt());
                System.out.println("ENTER NUMBER OF INTERN ASSIGNED TO");
                int sidd = reg.setId(input.nextInt());


                //INSERT SUPERVISOR DETAILS TO A DATABASE

                String sqlL;
                sqlL = "insert  into supervisor (FIRSTNAME,LASTNAME,DOB,SUPERVISOR_ID,INTERSASSIGNED) VALUES ('" + sfirstname + "','" + slastname + "','" + sdob + "','" + sid + "','" + sidd + "')";
                preparedstatement = connection.prepareStatement(sqlL);

                preparedstatement.executeUpdate();

                System.out.println("SUPERVISOR DETAILS SUCCESSFULLY INSERTED TO THE DATABASE");


                //FETCHING STUDENTS DETAILS FROM THE DATABASE

                // String sqlll;
                //sql="";


                //UPDATING THE INTERNS TABLE
                //update upd=new update();
                //UPDATE VARIABLE TO BE USED
                //System.out.println("ENTER INTERN ID :");
                //String sed= upd.setId(input.next());
                //DETAILS TO UPDATE
                //System.out.println("ENTER FIRSTNAME:");
                //String sIID= upd.setFirstname(input.next());

                //System.out.println("ENTER LASTNAME:");
                //String sIIID= upd.setLastname(input.nextLine());

                //update sql query
                //String squpdate;
                //squpdate="update interns set FIRSTNAME='"+sIID+"' , LASTNAME='"+sIIID+"' where ID='"+sed+"'";

                // preparedstatement.executeUpdate();

                //System.out.println("THE INFORMATION HAVE BEEN SUCEESFULLY UPDATED");


                //DELETE DETAILS FROM THE DATABASE

                // System.out.println("ENTER INTERN ID :");
                // int del= dell.setId(input.nextInt());
                //String SQdelete;
                // SQdelete="";


                connection.close();

            }

        } catch (Exception e) {

            e.printStackTrace();
        }


    }
}
