public class ExpressaoRegular {
	public static void main(String[] args) {
		String cpf = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}",
		       num = "\\d{4}\\-\\d{4}|\\d{5}\\-\\d{4}",
		       pla = "[A-Z]{3}\\-\\d{4}";

		String[] s = {"701.563.548-48","9851-5482","84595-8954","894-451-512.84",
                      "GGG-6988","TRSD-4845","RRS-448","asf885.484.625-82", 
			          "5265-00000","12345-1234"};

		for(String o : s)
			if(o.matches(cpf + "|" + num + "|" + pla))
				System.out.println(o + ": Accepted.");
			else
				System.out.println(o + ": Rejected.");
	}
}

