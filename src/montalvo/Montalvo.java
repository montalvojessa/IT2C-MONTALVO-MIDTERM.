
package montalvo;

import java.util.Scanner;


public class Montalvo {

        public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);
        String response;
        
        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter Action: ");
        int action =  sc.nextInt();
        switch(action){
            case 1:
               
            payment.addPayment();
            break;
            
            case 2:
           payment.viewPayment();
            break;
            
            case 3:
            payment.updatePayment();
            break;    
            
            case 4:
            payment.deletePayment();
            break;   
            
             
        }
            System.out.println("Do1 you want to continue? (yes/no): ");
            response = sc.next();  
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank you so much!"); 
    }
       public void addPayment(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        
        System.out.print("Payment ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter amount: ");
        Double amount = sc.nextDouble();
        System.out.print("Enter Payment Method: ");
        String method = sc.next();
        System.out.print("Status: ");
        String status = sc.next();

        String sql;
        sql = "INSERT INTO tbl_student(p_id, p_amount, p_method, p_status) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, id, amount, method, status);


    }

    private void viewPayment() {  
        config conf = new config();
        String studentQuery = "SELECT * FROM tbl_payment";
        String[] studentHeaders = {"Payment ID", "Amount", "Method", "Status"};
        String[] studentColumns = {"p_id", "p_amount", "p_method", "p_status"};


        conf.viewPayment(studentQuery, studentHeaders,studentColumns);
    }
    

private void updatePayment(){
 Scanner sc = new Scanner(System.in);

System.out.println(" Enter the id to update: ");
int id = sc.nextInt();

System.out.println("Enter new amount");
Double amount = sc.nextDouble();
System.out.println("New Payment method:");
String method = sc.next();
System.out.println("New Payment status:");
String status = sc.next();

   }

 private void deletePayment(){

    Scanner sc = new Scanner(System.in);
    
    
System.out.println("Enter the id to delete:");
int id = sc.nextInt();

String qry = "DELETE FROM tbl_payment WHERE p_id = ?";

 config conf = new config();
 conf. deleteRecord(qry, id);
 
  }
}

