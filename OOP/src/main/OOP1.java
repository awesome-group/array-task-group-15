package main;

public class OOP1 {

	public static void main(String[] args) {

		User user = new User();
		user.setAge(10);
		user.name = "Vaqif";
		user.surName = "Dadaszade";
		user.fatherName = "Elgiz";
		user.email = "vaqifdadaszade012@gmail.com";
		user.phoneNumber = "0555836373";
		System.out.println(user);
		System.out.println(user.getAge());

		User user2 = new User();
		user2.setAge(40);
		user2.name = "Elgiz";
		user2.surName = "Dadasov";
		user2.fatherName = "Vaqif";
		user2.email = "elgizdadasov123@gmail.com";
		user2.phoneNumber = "0556473246";
		System.out.println(user2);
		System.out.println(user2.getLastName());
	}

}
