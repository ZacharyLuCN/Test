public class printUnicode {
	//Unicode�����66536����16λ������������չΪ1112064����ASCII����Unicode��ǰ128����
	private static int startflag = 0, finalflag = 1112064;
	private static int varForm = 10;
	public static void main(String[] args) {
		System.out.println("//Unicode�����66536����16λ������������չΪ1112064����ASCII����Unicode��ǰ128����");
		System.out.println("Unicode(" + startflag + "~" + finalflag +"):");
		System.out.printf("%6d----", startflag / varForm);
		for (int i = 0; i < startflag % varForm; i++)
			System.out.print("     ");
		for (int i = startflag; i < finalflag; i++)
			if ((i + 1) % varForm == 0) {
				System.out.println((char)i);
				System.out.printf("%6d----", (i + 1) / varForm);
			} else 
				System.out.print((char)i + "    ");
	}
}
// 1 2 3 4 5 6 7 8 9 0
// ! @ # $ % ^ & * ( )
// Q W E R T Y U I O P A S D F G H J K L Z X C V B N M
// q w e r t y u i o p a s d f g h j k l z x c v b n m
// ` - = [ ] \ ; ' , . /
// ~ _ + { } | : " < > ?