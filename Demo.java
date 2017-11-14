import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.dem.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) throws IOException {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		/*session.beginTransaction();
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter ID:");
		int empId = Integer.valueOf(bf.readLine());
		System.out.print("Enter Name:");
		String name = bf.readLine();
		System.out.print("Enter Email:");
		String email = bf.readLine();
		System.out.print("Enter Phone:");
		long phoneNumber = Long.valueOf(bf.readLine());
		
		Employee emp = new Employee(empId, name, email, phoneNumber);

		System.out.println("ID:" + emp.getEmpId());
		System.out.println("Name:" + emp.getName());
		System.out.println("Email:" + emp.getEmail());
		System.out.println("Phone:" + emp.getPhoneNumber());
		session.save(emp);
		session.getTransaction().commit();*/
		session.close();
	}

}
