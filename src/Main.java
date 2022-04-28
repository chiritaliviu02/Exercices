import java.util.Map;
import static java.util.Map.entry;   

public class Main {

	public static String helloName(String name) {
		return "Hello " + name + "!" ;
	}

	public static String makeAbba(String a, String b) {
		return a+b+b+a;
	}

	public static  String makeTags(String tag, String word) {
		return "<" + tag +">" + word + "</" + tag + ">";
	}

	public static String makeOutWord(String out, String word) {
		return out.substring(0,2) + word + out.substring(2);
	}

	public static String firstTwo(String str) {
		if(str.length()<2){
			return str;
		}
		return str.substring(0,2);
	}

	public static String firstHalf(String str) {
		return str.substring(0, str.length()/2);
	}

	public static String comboString(String a, String b) {
		String srt ;
		String lng ;
		if(a.length()<b.length()){
			srt = a;
			lng = b;
		}
		else{
			srt = b;
			lng = a;
		}
		return srt + lng + srt; 
	}

	public static String nonStart(String a, String b) {
		String aF = a.substring(1);
		String bF = b.substring(1);
		return aF + bF;
	}

	public static String left2(String str) {
		String primele = str.substring(0, 2);
		String mij = str.substring(2, str.length());
		return mij + primele;
	}

	public static String right2(String str) {
		String ultimele = str.substring(str.length()-2);
		String mij = str.substring(0, str.length()-2);
		return ultimele + mij;
	}

	public static String theEnd(String str, boolean front) {
		if(front){
			return Character.toString(str.charAt(0));
		}
		else{
			return Character.toString(str.charAt(str.length()-1));

		}

	}

	public  static String withouEnd2(String str) {
		if(str.length()<2){
			return "";
		}
		String mij = str.substring(1, str.length()-1);

		return mij;
	}

	public static String middleTwo(String str) {
		int indiceJumate = str.length() / 2;
		String indici = str.substring(indiceJumate -1, indiceJumate +1);
		return indici;
	}


	public static boolean endsLy(String str) {
		if( str.length() >=2 && str.substring(str.length()-2).compareTo("ly")== 0 ){
			return true;
		}
		return false;
	}

	public static String nTwice(String str, int n) {
		return str.substring(0, n) + str.substring(str.length()-n);

	}

	public static String twoChar(String str, int index) {
		if(index >= str.length()-1 || index<0){
			return str.substring(0, 2);
		}
		else{
			return str.substring(index, index + 2);
		}
	}

	public static String middleThree(String str) {

		String mijloc = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
		return mijloc;
	}


	public static boolean hasBad(String str) {
		if(str.startsWith("bad", 0) || str.startsWith("bad",1)){
			return true;
		}
		return false;
	}

	public static  String atFirst(String str) {
		if(str.length()==0){
			return "@@";
		}
		if(str.length() == 1){
			return str.charAt(0) + "@";
		}
		return str.substring(0 , 2);
	}


	public static String withoutEnd(String str) {
		String mij = str.substring(1, str.length()-1);
		return mij;
	}



	public static String extraEnd(String str) {
		String t1 = str.substring(str.length()-2) ;
		return t1 + t1 + t1;

	}

	public static String lastChars(String a, String b) {
		if(a.length()==0 && b.length()==0){
			return "@@";
		}
		if(a.length()==0){
			return "@"+ b.charAt(b.length()-1); 
		}
		if(b.length() == 0){
			return a.charAt(0) + "@";
		}

		return Character.toString(a.charAt(0)) + b.charAt(b.length() - 1);
	}

	public static  String conCat(String a, String b) {
		if(a.length()== 0){
			return b;
		}
		if(b.length()==0){
			return a;

		}
		if(a.charAt(a.length()-1) == b.charAt(0)){
			return a.substring(0, a.length()-1) + b ;
		}
		return a + b;
	}

	public static String lastTwo(String str) {
		if(str.length()<2){
			return str;
		}
		int penultimaI = str.length()-2;
		char ultimul = str.charAt(str.length()-1);
		char penultimul = str.charAt(penultimaI);
		return str.substring(0, penultimaI) + ultimul + penultimul;
	}

	public static String seeColor(String str) {
		if(str.startsWith("red")){
			return "red";
		}
		if(str.startsWith("blue")){
			return "blue";
		}
		return "";
	}

	public static  boolean frontAgain(String str) {
		if(str.length()<2){
			return false;
		}
		if(str.substring(0,2).equals(str.substring(str.length()-2))){

			return true;
		}
		return false;
	}

	public static String minCat(String a, String b) {
		if(a.length() == b.length()){
			return a + b;
		}
		if(a.length()<b.length()){
			int dif = b.length() - a.length();
			return a + b.substring(dif);
		}
		int dif2 = a.length() - b.length();
		return a.substring(dif2) + b;

	}

	public static String extraFront(String str) {
		if(str.length()<=2){
			return str + str + str;
		}
		String primele2 = str.substring(0,2);


		return primele2 + primele2 + primele2;

	}

	public static String without2(String str) {
		if(str.length() == 3){
			return str.charAt(1) + "";
		}
		if(str.length()<=2){
			return "";
		}
		String primele = str.substring(0, 2);
		String ultimele = str.substring(str.length()-2);
		String mijloc = str.substring(2, str.length()-2 );

		if(primele.equals(ultimele)){
			return mijloc + ultimele;
		}
		return str;
	}

	public static String deFront(String str) { 
		if(str.length() == 0){
			return "";}
		String ultimele = str.substring(2);
		if(str.charAt(0)=='a'&& str.charAt(1)=='b'){
			return str;
		}
		if(str.charAt(0)=='a' && str.charAt(1)!='b'){
			return str.charAt(0) + ultimele;
		}
		if(str.charAt(0)!='a' && str.charAt(1)=='b'){
			return str.charAt(1) + ultimele;
		}
		return ultimele;
	}

	public  static String startWord(String str, String word) {
		if(str.length() == 0){
			return "";
		}
		String str1 = str.substring(1);
		String word1 = word.substring(1);
		if(str1.startsWith(word1)){
			return str.substring(0 , word.length());
		}
		if(str.contains(word)){
			return str.charAt(0) + "";
		}
		else{
			return "";
		}



	}

	public static String withoutX(String str) {
		if(str.length()<=1){
			return "";
		}

		String mijloc = str.substring(1, str.length() -1 );
		if(str.startsWith("x") && str.endsWith("x")){
			return mijloc;
		}
		if(str.startsWith("x")){
			return str.substring(1);
		}
		if(str.endsWith("x")){
			return str.substring(0, str.length()-1);
		}
		return str;
	}

	public static  String withoutX2(String str) {
		if(str.length()<=1){
			return "";}
		if(str.substring(0,2).equals("xx")){
			return str.substring(2);
		}
		if(str.charAt(0) == 'x'){
			return str.substring(1);

		}
		if(str.charAt(1) == 'x'){
			return str.charAt(0) + str.substring(2);
		}
		return str;

	}




	public static boolean xyzMiddle(String str) 
	{
		if(str.length() < 3 )
		{
			return false;
		}

		String primaJum = str.substring(0, str.length() / 2);

		String ultimaJum = str.substring(str.length()/2);
		boolean estePar = str.length() % 2 == 0;
		String stringulMeu;
		if(estePar) {
			stringulMeu = str.substring(str.length() /2  -1, str.length() /2 + 2);
		}
		else
		{
			stringulMeu = str.substring(str.length() /2  -2, str.length() /2 + 1);
		}
		System.out.println("lungimea este para ? " + estePar);
		System.out.println("Prima jumatate = " + primaJum);
		System.out.println("ultima jumatate = " +ultimaJum);
		System.out.println(stringulMeu);

		if(stringulMeu.contains("xyz"))
		{
			if(Math.abs(primaJum.length() - ultimaJum.length()) > 1) {

				return false;
			}
			return true;

		}
		return false;
	}

	public static int noTeenSum(int a, int b, int c) {

		if(isTeen(a, b))
		{
			return c;
		}
		if(isTeen(a, c))
		{
			return b;
		}
		if(isTeen(b, c))
		{
			return a;
		}
		if(isTeen(a))
		{
			return b + c;
		}
		if(isTeen(b)){
			return a + c;
		}
		if(isTeen(c))
		{
			return a + b;
		}

		if(isTeen(a, b, c))
		{
			System.out.println("Toate sunt teen:" + a + "," + b + "," + c);
			return 0;
		}

		return a + b + c;



	}

	static boolean isTeen(int... vargs )
	{
		int countTeens = 0;
		for(int i : vargs)
		{
			System.out.println("I= " + i);
			if(i >=13 && i <= 19 && i !=15 && i!=16 ){
				countTeens++;
			}  
		}

		if(vargs.length == countTeens)
		{
			return true;
		}
		return false;
	}

	public static boolean firstLast6(int[] nums) {
		if(nums[0]==6 || nums[nums.length-1]==6){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean sameFirstLast(int[] nums) {
		if(nums.length>0 && nums[0]==nums[nums.length-1]){
			return true;
		}
		else{
			return false;
		}
	}

	public static int[] makePi() {
		int[] pi = {3,1,4};
		return pi;
	}

	public static boolean commonEnd(int[] a, int[] b) {
		if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
			return true;
		}
		else{
			return false;
		}
	}

	public static int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i< nums.length; i++){

			sum = sum + nums[i];

		}

		return sum;
	}

	public static int[] rotateLeft3(int[] nums) {
		int temp=nums[0];
		nums[0]=nums[1];
		nums[1]=nums[2];
		nums[2]=temp;

		return nums;
	}

	public static int[] reverse3(int[] nums) {
		int[] rev = new int[3];
		rev[0]= nums[2];
		rev[1]=nums[1];
		rev[2]=nums[0];
		return rev;
	}

	public static int sum2(int[] nums) {
		if(nums.length==0){
			return 0;
		}
		if(nums.length ==1){
			return nums[0];
		}
		return nums[0] + nums[1];
	}

	public static int[] middleWay(int[] a, int[] b) {
		int[] array = new int[2];
		array[0]=a[1];
		array[1]=b[1];
		return array;
	}

	public static  int[] makeEnds(int[] nums) {
		int[] numere= new int[2];
		numere[0]=nums[0];
		numere[1]=nums[nums.length-1];
		return numere;
	}

	public static boolean has23(int[] nums) {
		if(nums[0]==2 || nums[1]==2 || nums[0]==3 ||nums[1]==3){
			return true;
		}
		else{
			return false;
		}
	}

	public static int[] makeLast(int[] nums) {
		int[] dublu = new int[nums.length*2];

		dublu[dublu.length-1]=nums[nums.length-1];
		return dublu;
	}

	public static boolean double23(int[] nums) {
		if ( nums.length>=2 )
		{
			int tww = 0;
			int thr = 0;
			for(int i=0; i<nums.length; i++)
			{
				if(nums[i]==2)
				{
					tww++;
				}
				if(nums[i]==3)
				{
					thr++;
				}

			}
			if(tww==2 || thr ==2){
				return true;
			}


		}
		return false;
	}

	public static int start1(int[] a, int[] b) {
		int count = 0;

		if(a.length>0 && a[0]==1){
			count++;
		}
		if(b.length>0 && b[0]==1){
			count++;
		}
		return count;
	}

	public static int[] makeMiddle(int[] nums) {
		int mijloc = nums.length/2;
		int[] array = new int[2];
		array[0]= nums[mijloc-1];
		array[1]= nums[mijloc];
		return array;

	}

	public static int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0]=nums[nums.length-1];
		nums[nums.length-1]=temp;
		return nums;
	}

	public static int maxTriple(int[] nums) {
		int max = 0;
		if(nums.length<3){
			max=nums[0];
		}
		int mij = nums[nums.length/2];
		int prim = nums[0];
		int utm = nums[nums.length-1];
		max = prim;
		if(max<mij){
			max=mij;
		}
		if(max<utm){
			max=utm;
		}
		return max;

	}

	public static int[] frontPiece(int[] nums) {
		if(nums.length<2){
			return nums;
		}
		else{
			int[] front = new int[2];
			front[0]=nums[0];
			front[1]=nums[1];
			return front;
		}
	}

	public static boolean unlucky1(int[] nums) {
		if(nums.length<2){
			return false;
		}
		for(int i = 0; i<nums.length-1; i++){
			if(nums[i]==1 && nums[i+1]==3){
				return true;
			}

		}
		return false;
	}

	public static int[] make2(int[] a, int[] b) {
		int[] array = new int[2];
		if(a.length==0){
			array[0]= b[0];
			array[1]= b[1];
		}
		if(a.length==1){
			array[0]=a[0];
			array[1]=b[0];
		}
		if(a.length>=2){
			array[0]=a[0];
			array[1]=a[1];
		}
		return array;
	}

	public static int[] front11(int[] a, int[] b) {

		if(a.length>0 && b.length>0){
			int[] primele = new int[2];
			primele[0] = a[0];
			primele[1] = b[0];
			return primele;
		}
		else
		{
			if(a.length==0 && b.length>0)
			{
				int[] primaB = new int[1];
				primaB[0]= b[0];
				return primaB;
			}
			if(b.length==0 && a.length>0){
				int[] primaA= new int [1];
				primaA[0]= a[0];
				return primaA;
			}

		}
		return new int[0];
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if(isWeekend == true)
		{
			if(cigars>=40)
			{
				return true;
			}
			else{
				return false;
			}
		}
		else if(cigars >=40 && cigars <= 60)
		{
			return true;
		}
		return false;
	}

	public static int dateFashion(int you, int date) {
		if(you<=2 || date <= 2){
			return 0;
		}

		if(you>=8 || date >=8){
			return 2;
		}

		return 1;	      
	}

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if(isSummer && temp>=60 && temp<=100){
			return true;
		}
		if(temp>=60 && temp<=90){
			return true;
		}
		return false;
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		int limit = 0;
		if(isBirthday){
			limit=5;
		}
		if(speed <= 60 + limit){
			return 0;
		}
		if(speed >= 61 && speed <= 80 + limit){
			return 1;
		}

		return 2;

	}

	public static int sortaSum(int a, int b) {
		int sum = a + b;
		if(sum>=10 && sum<=19){
			return 20;
		}
		return sum;
	}

	public static String alarmClock(int day, boolean vacation) {
		boolean isWeekend = false;
		if (day==0 || day==6){
			isWeekend = true;
		}
		if(vacation && isWeekend){
			return "off";
		}
		if(isWeekend ==false && vacation==false){
			return "7:00" ;
		}
		if(isWeekend==true && vacation == false){
			return "10:00";

		} 
		return "10:00";
	}

	public static boolean love6(int a, int b) {
		int sum = a+b;
		int dif = a-b;
		int dif1 =b-a;
		if( a==6 || b==6 || sum==6 || dif==6 || dif1==6){
			return true;
		}
		return false;
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		if(outsideMode){
			if(n<=1 || n>=10){
				return true;
			}
			else{
				return false;
			}
		}
		if(n>=1 && n<=10){
			return true;
		}
		return false;
	}

	public static boolean specialEleven(int n) {
		int rest = n%11;
		if(rest == 0 || rest == 1){
			return true;
		}
		return false;
	}

	public static boolean more20(int n) {
		int rest = n%20;
		if(rest==1 || rest==2){
			return true;
		}
		return false;
	}

	public static boolean old35(int n) {
		int rest3 = n%3;
		int rest5 = n%5;
		if(rest3 == 0 && rest5 == 0){
			return false;
		}
		if(rest3 == 0 || rest5 == 0){
			return true;
		}
		return false;
	}

	public static boolean less20(int n) {
		int rest = n%20;
		if(rest==19 || rest==18 ){
			return true;
		}
		return false;
	}

	public static boolean nearTen(int num) {
		if(num%10<=2 || num%10>=8){
			return true;
		}
		return false;
	}

	public static int teenSum(int a, int b) {
		int sum = a+b;
		if(a>=13&&a<=19 || b>=13&&b<=19){
			return 19;
		}
		return sum;
	}
	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if(isAsleep){
			return false;
		}
		if(isMorning){
			if(isMom){
				return true;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public static int teaParty(int tea, int candy) {
		if (tea<5 || candy < 5){
			return 0;
		}
		if(tea / 2 >= candy || candy / 2 >= tea){
			return 2;
		}

		if (tea>=5 && candy>=5){
			return 1;
		}


		return 0;
	}

	public static String fizzString(String str) {
		boolean incepe = str.charAt(0) == 'f';
		boolean termina = str.endsWith("b") ;
		if ( incepe && termina == true){
			return "FizzBuzz";
		}
		if(incepe==true){
			return "Fizz";
		}
		if(termina==true){
			return "Buzz";
		}  

		return str;

	}

	public static String fizzString2(int n) {
		boolean div3 = n % 3 == 0;
		boolean div5 = n % 5 == 0;
		if( div3 && div5 ){
			return "FizzBuzz!";
		}
		if( div3){
			return "Fizz!";
		}
		if(div5){
			return"Buzz!";
		}
		return  String.valueOf(n) +  "!"; 
	}

	public static boolean twoAsOne(int a, int b, int c) {
		if(a+b==c ||a+c==b || b+c==a ){
			return true;
		}
		return false;
	}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if(bOk && c > b){
			return true;
		}
		if(b>a && c> b){
			return true;
		}
		return false;
	}

	public static boolean lastDigit(int a, int b, int c) {
		int aP = a%10;
		int bP = b%10;
		int cP = c%10;
		if(aP==bP || aP == cP || bP==cP){
			return true;
		}
		return false;
	}

	public static boolean lessBy10(int a, int b, int c) {
		int aM =Math.abs(a-b);
		int bM= Math.abs(a-c);
		int cM = Math.abs(b-c);
		if (aM >=10 || bM>=10 || cM>=10){
			return true;
		}
		return false;

	}

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

		if(noDoubles){
			if(die1==die2){
				die1++;
			}
			if(die1==7){
				die1=1;
			}
		} 
		int sum = die1 + die2;
		return sum;
	}

	public static int maxMod5(int a, int b) {
		if(a == b){
			return 0;
		}
		boolean restIsEqual = a%5 == b%5;
		int larger = Math.max(a , b);
		int small = Math.min(a, b);
		if(restIsEqual){
			return small;
		}
		else{
			return larger;
		}
	}

	public static int redTicket(int a, int b, int c) {
		if(a==2 && b==2 && c==2){
			return 10;
		}
		if(a==b && b==c){
			return 5;
		}
		else if(b !=a && c != a){
			return 1;
		}
		return 0;
	}

	public static int greenTicket(int a, int b, int c) {
		if(a !=b && b != c && a != c){
			return 0;
		}
		if(a == b && b == c){
			return 20;
		}
		return 10;

	}

	public static  int blueTicket(int a, int b, int c) {
		int sum1 = a+b;
		int sum2 = b+c;
		int sum3 = a+c;
		if(sum1==10 || sum2==10 || sum3==10){
			return 10;
		}
		if(sum1==sum2 + 10 || sum1== sum3 + 10){
			return 5;
		}
		return 0;
	}

	public static boolean shareDigit(int a, int b) {
		int prmA = a / 10;
		int doiA = a % 10;
		int prmB = b / 10;
		int doiB = b % 10;
		if(prmA == prmB || prmA == doiB || doiA == prmB || doiA == doiB  ){
			return true;
		}
		return false;
	}

	public static int sumLimit(int a, int b) {
		int sum = a+b;
		String sumStr = String.valueOf(sum);
		String aStr = String.valueOf(a);
		if(sumStr.length() == aStr.length()){
			return sum;
		}
		return a;
	}

	public static Map<String, String> mapBully(Map<String, String> map) {
		if(map.containsKey("a")){
			map.put("b", map.get("a"));
			map.put("a","");
		}
		return map;
	}

	public static  Map<String, String> mapShare(Map<String, String> map) {
		if(map.containsKey("a")){
			map.put("b",map.get("a"));

		}
		map.remove("c");
		return map;
	}

	public static Map<String, String> mapAB(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")){
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	public static Map<String, String> topping1(Map<String, String> map) {
		if(map.containsKey("ice cream")){
			map.put("ice cream","cherry");
		}
		map.put("bread","butter");
		return map;
	}

	public static Map<String, String> topping2(Map<String, String> map) {
		if(map.containsKey("ice cream")){
			map.put("yogurt", map.get("ice cream") );
		}
		if(map.containsKey("spinach")){
			map.put("spinach","nuts");
		}
		return map;
	}

	public static Map<String, String> topping3(Map<String, String> map) {
		if(map.containsKey("potato")){
			map.put("fries", map.get("potato"));
		}
		if(map.containsKey("salad")){
			map.put("spinach", map.get("salad"));
		}
		return map;

	}

	public static Map<String, String> mapAB2(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")){
			if(map.get("a").equals(map.get("b"))){
				map.remove("a");
				map.remove("b");
			}
		}
		return map;
	}

	public static Map<String, String> mapAB3(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")){
			return map;
		}
		if(map.containsKey("a")){
			map.put("b",map.get("a"));
		}
		if(map.containsKey("b")){
			map.put("a", map.get("b"));
		}
		return map;
	}

	public static Map<String, String> mapAB4(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b"))
		{
			if(map.get("a").length() == map.get("b").length())
			{
				map.put("a","");
				map.put("b","");
			}


		}

		if(map.containsKey("a") && map.containsKey("b"))
		{
			if(map.get("a").length() > map.get("b").length() && map.get("a").length()!=0)
			{
				map.put("c",map.get("a"));
			}
			else if(map.get("b").length() != 0)
			{
				map.put("c",map.get("b")); 
			}
		}
		return map;
	}

	public static String doubleChar(String str) {
		char[] litereDublate = new char[str.length() * 2 ];
		for(int i = 0; i< str.length() ; i++){
			litereDublate[i*2] = str.charAt(i);
			litereDublate[i*2 + 1] = str.charAt(i);
		}
		return String.valueOf(litereDublate);
	}

	public static int countHi(String str) {
		int count = 0;
		int lastIndex = str.indexOf("hi");
		while(lastIndex != -1){
			count++;
			lastIndex = str.indexOf("hi", lastIndex + 2);
		}
		return count;

	}

	public static boolean catDog(String str) {
		int countDog = 0;
		int countCat = 0;

		for(int i = 0 ; i< str.length() - 2 ; i ++){
			String comparedString = str.substring(i, i+3);
			if(comparedString.equals("cat")){
				countCat ++;
			}
			if(comparedString.equals("dog")){
				countDog ++;
			}

		}
		if(countDog == countCat){
			return true;
		}
		return false;

	}

	public static int countCode(String str) {
		int count = 0;
		for(int i = 0; i < str.length() -3; i++){
			if(str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")){
				count ++;
			}

		}
		return count;




	}

	public static boolean endOther(String a, String b) {
		String mici1 = a.toLowerCase();
		String mici2 = b.toLowerCase();
		if(mici1.endsWith(mici2) || mici2.endsWith(mici1)){
			return true;
		}
		return false;
	}

	public static boolean xyzThere(String str) {
		int lastIndex = str.indexOf("xyz");
		boolean found = false;
		while(lastIndex != -1){
			if(  lastIndex != 0 && str.charAt(lastIndex-1) != '.'){
				found = true;
				break;
			}
			if(lastIndex == 0 ){
				found = true;
				break;
			}
			lastIndex = str.indexOf("xyz", lastIndex + 3);
		}


		return found;

	}

	public static boolean bobThere(String str) {

		for(int i =0; i<str.length()-2; i++){
			if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
				return true;
			}

		}

		return false; 

	}

	public static boolean xyBalance(String str) {
		boolean balanced = true;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'x'  )
			{
				balanced = false; 
			}
			if(str.charAt(i) == 'y')
			{
				balanced = true;
			}
		}
		return balanced;
	}

	public static String mixString(String a, String b) {
		char[] amandoua = new char[a.length() + b.length()];
		int indiceA = 0;
		int indiceB = 0;
		int indiceArray = 0;
		while(indiceA < a.length() || indiceB < b.length() )
		{
			if(indiceA < a.length()){
				amandoua[indiceArray] = a.charAt(indiceA);
				indiceArray++;
			}
			if(indiceB < b.length()){
				amandoua[indiceArray] = b.charAt(indiceB);
				indiceArray++;
			}
			indiceA++;
			indiceB++;
		}
		return String.valueOf(amandoua);
	}

	public static String repeatEnd(String str, int n) {
		if(n == 0){
			return "";
		}
		String repetat = "";
		String ultimele = str.substring(str.length() - n , str.length());
		for(int i = 0; i < n; i++){
			repetat = repetat + ultimele;
		}

		return repetat;
	}

	public static String repeatFront(String str, int n) {
		String rezultat = "" ;
		for(int i = n; i > 0; i--)
		{
			rezultat = rezultat + str.substring(0 , i); 
		}
		return rezultat;
	}

	public static String repeatSeparator(String word, String sep, int count) {
		String rezultat = "";
		while(count  > 0){
			rezultat = rezultat + word + sep ;
			count--;
		}
		rezultat = rezultat.substring(0, rezultat.length() - sep.length());
		return rezultat;
	}

	public static boolean prefixAgain(String str, int n) {
		String sbs = str.substring(0 , n);
		if(str.substring(n, str.length()).contains(sbs))
		{
			return true;
		}
		return false;
	}


	public static String oneTwo(String str) {
		String rezultat = "";
		for(int i = 0; i < str.length(); i+=3)
		{
			if(str.substring(i).length() / 3 >= 1 )
			{
				rezultat = rezultat + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i); 

			}
			else
			{
				//rezultat = rezultat + str.substring(i);
				break;
			}

		}

		return rezultat;
	}

	public static String plusOut(String str, String word) {
		String rezultat = "";
		int indiceCautare = 0;

		for(int indiceLast = str.indexOf(word, indiceCautare);
				indiceLast != -1; indiceLast = str.indexOf(word, indiceCautare)){
			for(int i = indiceCautare; i < indiceLast; i++ ){
				rezultat += "+";
			}
			rezultat += word; 
			indiceCautare = rezultat.length();
		}

		for(int i = rezultat.length(); i<str.length(); i++ ){
			rezultat = rezultat + "+";
		}

		return rezultat;

	}

	public static String wordEnds(String str, String word) {
		String rezultat = "";
		for(int indexApare = str.indexOf(word); indexApare != -1;
				indexApare = str.indexOf(word,word.length()+indexApare))
		{
			if(indexApare > 0)
			{
				rezultat = rezultat + str.charAt(indexApare - 1);
			}
			if(indexApare < str.length() - word.length() )
			{
				rezultat = rezultat + str.charAt(indexApare + word.length());
			}

		}
		return rezultat;
	}

	public static int countEvens(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
				count ++;
			}
		}
		return count;
	}

	public static int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length; i++)
		{ 
			max = Math.max(nums[i], max);
			min = Math.min(nums[i], min);
		}
		return max - min;
	}

	public static int sum13(int[] nums) {
		if(nums.length == 0)
		{
			return 0;
		}
		int suma = 0;
		for(int i = 0; i < nums.length ; i++)
		{
			if(nums[i] != 13   )
			{
				suma = suma + nums[i];
			}
			else
			{
				i++;
			}



		}

		return suma;
	}

	public static int sum67(int[] nums) {
		boolean amgasit6 = false;

		int suma = 0;
		for(int i = 0; i < nums.length; i++)
		{

			if(nums[i] == 6)
			{
				amgasit6 = true;
			}
			if(amgasit6 == false)
			{
				suma = suma + nums[i];
			}
			if(nums[i] == 7)
			{
				amgasit6 = false;
			}


		}
		return suma;
	}

	public static boolean has22(int[] nums) {
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 2  && i< nums.length -1 && nums[i + 1] == 2 )
			{
				return true;
			}

		}
		return false;
	}

	public static boolean lucky13(int[] nums) {
		for(int i = 0; i< nums.length; i++)
		{
			if(nums[i] == 1 || nums[i] == 3)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean sum28(int[] nums) {
		int suma = 0;
		for(int i = 0; i < nums.length ; i++)
		{
			if(nums[i] == 2 )
			{
				suma = suma + nums[i];
			}
		}
		if(suma == 8)
		{
			return true;
		}
		return false;
	}

	public static  boolean more14(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 1)
			{
				count++;
			}
			if(nums[i] == 4)
			{
				count--;
			}

		}

		return count > 0;
	}


	public static  int[] fizzArray(int n) {
		int [] nou = new int[n];
		for (int i = 0; i < n; i++ )
		{
			nou[i] = i;
		}
		return nou;
	}

	public static boolean only14(int[] nums) {
		boolean este14 = true;
		for(int i = 0; i < nums.length; i ++)
		{
			if(nums[i] != 1 && nums[i] != 4 ){
				return false;
			}
		}
		return true;
	}

	public static String[] fizzArray2(int n) {
		String[] nou = new String[n];
		for(int i = 0; i < n; i++)
		{
			nou[i] = String.valueOf(i);
		}
		return nou;
	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for(int i = 0; i< nums1.length; i++)
		{
			if(Math.abs(nums1[i] - nums2[i]) <=2 && nums1[i] != nums2[i])
			{
				count++;
			}
		}
		return count;
	}

	public static boolean has77(int[] nums) {
		boolean amGasit7 = false;
		for( int i = 0; i < nums.length-1; i++)
		{
			for(; i<nums.length-2; i++)
			{

				if( nums[i] == 7 && nums [i+2] == 7)
				{
					amGasit7 = true;
				}
				else
				{
					amGasit7 = false;
				}
			}

			if( nums[i] == 7 && nums[i+1] == 7 )
			{
				amGasit7 = true;
			}
			else{
				amGasit7 = false;
			}


		}


		return amGasit7;
	}

	public static boolean has12(int[] nums) {
		boolean avem1 = false;

		for(int i = 0; i < nums.length; i++)
		{

			if(nums[i] == 1){
				avem1 = true;
			}

			if(avem1 == true && nums[i] == 2)
			{
				return true;  
			}

		}
		return false;
	}

	public static boolean modThree(int[] nums) {
		boolean avemPare = false;
		boolean avemImpare = false;
		for(int i = 0; i<nums.length -2; i++)
		{
			if(nums[i]%2 == 0 && nums[i+1]%2 == 0 && nums[i+2]%2 == 0)
			{
				avemPare = true;
			}
			if(nums[i]%2 != 0 && nums[i+1]%2 != 0 && nums[i+2]%2 !=0 )
			{
				avemImpare = true;
			}
		}
		return avemPare || avemImpare;
	}

	public static boolean haveThree(int[] nums) {
		if(nums.length < 2)
		{
			return false;
		}
		int count = 0;
		if(nums[0] == 3 && nums[1] != 3)
		{
			count++;
		}
		if(nums[nums.length-1] ==3 && nums[nums.length-2] != 3)
		{
			count++;
		}
		for(int i = 1; i<nums.length - 1; i++)
		{
			if(nums[i] == 3 && nums[i-1] != 3 && nums[i+1] != 3)
			{
				count ++;
			}
		}
		return count == 3;

	}

	public static  boolean twoTwo(int[] nums) {
		if(nums.length <2 )
		{
			return false;
		}
		if(nums[0] == 2 & nums[1] != 2)
		{
			return false;
		}
		if(nums[nums.length-1] == 2 && nums[nums.length-2] != 2)
		{
			return false;
		}
		for(int i =1; i< nums.length -1; i++)
		{
			if(nums[i] == 2 && nums[i-1] == 2 || nums[i+1] == 2)
			{
				return true;
			}
		}
		return false;

	}

	public static boolean sameEnds(int[] nums, int len) {
		for(int i = 0; i < len; i++)
		{
			if(nums[i] != nums[nums.length - len + i  ])
			{
				return false;
			}
		}
		return true;
	}

	public static  boolean tripleUp(int[] nums) {
		if(nums.length < 3 )
		{
			return false;
		}
		for(int i = 0; i<nums.length - 2; i++)
		{
			if(nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i+1] + 1)
			{
				return true;
			}
		}
		return false;
	}

	public static int[] fizzArray3(int start, int end) {
		int[] amandoua = new int[end - start];
		for(int i = 0; i < amandoua.length; i++ )
		{
			amandoua[i] = start + i;
		}
		return amandoua;
	}

	public static int[] shiftLeft(int[] nums) {
		if(nums.length < 1)
		{
			return new int[0];
		}
		int primul = nums[0];
		for(int i = 1; i<nums.length; i++)
		{
			nums[i-1] = nums[i];
		}
		nums[nums.length-1] = primul;
		return nums;
	}

	public static int[] post4(int[] nums) {
		if(nums.length < 2)
		{
			return new int[0];
		}
		int pos = -1;
		for(int i = nums.length-1; i >= 0; i--)
		{
			if(nums[i] == 4)
			{
				pos = i;
				break;
			}
		}
		int[] rest = new int[nums.length - 1 - pos];
		for(int i = pos + 1; i< nums.length; i++)
		{
			rest[i-pos-1]=nums[i];
		}
		return rest;
	}

	public static boolean makeBricks(int small, int big, int goal) {
		int numarCaramiziMariNecesare = goal /5 ;
		int numarCaramiziMiciNecesare = goal % 5;


		if(small >= numarCaramiziMiciNecesare && big >= numarCaramiziMariNecesare ){
			return true;
		}
		if(small >= numarCaramiziMiciNecesare)
		{
			small -= numarCaramiziMiciNecesare;
		}
		else
		{
			return false;
		}


		if(big + small/5 >= numarCaramiziMariNecesare)
		{
			return true;
		}

		return false;


	}

	public static int loneSum(int a, int b, int c) {
		if(a == b && b == c)
		{
			return 0;
		}
		if(a == b)
		{
			return c;
		}
		if(a == c)
		{
			return b;
		}
		if(b == c)
		{
			return a;
		}
		return a + b + c;
	}

	public static int luckySum(int a, int b, int c) {
		if(a == 13)
		{
			return 0;
		}
		if(b == 13)
		{
			return a;
		}
		if(c == 13)
		{
			return a + b;
		}
		return a + b + c;
	}

	public static int blackjack(int a, int b) {
		if(a >= b)
		{
			if(a<=21){
				return a;
			}
			if (b<=21)
			{
				return b;
			}

		}
		else
		{
			if(b<=21){
				return b;
			}
			if(a<=21)
			{
				return a;
			}
		}

		return 0;
	}

	public static boolean evenlySpaced(int a, int b, int c) {
		int diferentaAB = Math.abs(a - b);
		int diferentaBC = Math.abs(b - c);
		int diferentaAC = Math.abs(a - c);
		if(a == b && b == c) return true;
		if(a == b || b == c){
			return false;
		}
		if(diferentaAB == diferentaBC || diferentaAB == diferentaAC || diferentaBC == diferentaAC) return true;

		return false;

	}

	public static int makeChocolate(int small, int big, int goal) {
		int numarSNecesare = goal % 5;
		int numarBNecesare = goal / 5;

		if(big >= numarBNecesare)
		{
			goal = goal - numarBNecesare * 5;  
		}
		else
		{
			goal -= big * 5;
		}


		if(goal > small)
		{
			return -1;
		}

		return goal;
	}

	public static String withoutString(String base, String remove) {
		return  base.replace(remove.toUpperCase(), "")
				.replace(remove.toLowerCase(), "")
				.replace(remove,"");
	}



	public static boolean equalIsNot(String str) {


		if(str.indexOf("is") < 0 && str.indexOf("not") <0)
		{
			return true;
		}
		String is = str.substring(str.indexOf("is"),str.length());
		String not = str.substring(str.indexOf("not"), str.length());

		int countIs = contine(str, "is");
		int countNot = contine(str, "not");

		if(countIs == countNot)
		{
			return true;  
		}
		return false;
	}

	public static int contine(String str, String target){
		int count = 0;

		if(str.indexOf(target) == -1)
		{
			return 0;
		}

		for(int i = 0; i<=str.length()-target.length(); i++)
		{
			if(str.substring(i, i + target.length()).equals(target))
			{
				count++;
			}
		}
		return count;  
	}


	public static boolean gHappy(String str) {
		if(str.length() == 0)
		{
			return true;
		}
		if(str.length() < 2)
		{
			return false;
		}
		if(str.charAt(0) == 'g' && str.charAt(1) != 'g')
		{
			return false;
		}
		if(str.charAt(str.length() -1 ) == 'g' && str.charAt(str.length() -2 ) != 'g')
		{
			return false;
		}
		boolean happy = false;
		for(int i = 1; i<str.length(); i++)
		{
			if(str.charAt(i) == 'g'){
				if(str.charAt(i-1) == 'g' || str.charAt(i+1) == 'g')
				{
					happy = true;
				}
				else
				{
					return false;
				}
			}
		}
		return happy;
	}


	public static int sumDigits(String str) {
		int sum = 0;
		for( int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum = sum + Integer.parseInt(str.charAt(i) + "");
			}
		}
		return sum;
	}

	public static String sameEnds(String string) {
		for(int i = string.length() / 2; i > 0; i--)
		{
			if(string.substring(0, i).equals(string.substring(string.length()- i)))
			{
				return string.substring(0,i);
			}
		}
		return "";
	}

	public static String mirrorEnds(String string) {
		String strMeu = "";
		for(int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) == string.charAt(string.length() - 1 - i ))
			{
				strMeu += string.charAt(i);
			}
			else
			{
				break;
			}
		}

		return strMeu;	  
	}


	public  static int maxBlock(String str) {
		int maxM = -1;
		for(int i = 0; i<str.length(); i++)
		{
			int maxmic = 0;
			for(int j = i+1; j < str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					maxmic++;
				}
				else
				{
					break; 
				}
			}
			if(maxM < maxmic)
			{
				maxM = maxmic;
			}
		}

		return maxM+1;		  
	}

	public static int sumNumbers(String str) {
		String faraLitere = str.replaceAll("[^0-9]", " ");
		String[] faraSpatii = faraLitere.split(" ");
		int sum = 0;
		for(int i = 0; i< faraSpatii.length; i++)
		{
			if(!faraSpatii[i].isEmpty())
			{
				sum = sum + Integer.parseInt(faraSpatii[i]);
			}
		}
		return sum;
	}

	public static int maxSpan(int[] nums) {
		int maxSpan=0;
		if(nums.length == 0)
		{
			return 0;
		}
		for(int i = 0; i<nums.length; i ++)
		{
			int span = 0;
			for(int j = nums.length-1; j > i; j--)
			{
				if(nums[i] == nums[j])
				{
					span = j - i;

					break;
				}
			}
			if(maxSpan < span)
			{
				maxSpan = span;
			}
		}
		return maxSpan+1;

	}

	public static int[] fix34(int[] nums) {
		int last4 = 0;
		for(int i = 0; i<nums.length-1; i++)
		{

			if(nums[i] == 3)
			{
				for(int j =last4+1 ; j< nums.length; j++)
				{
					if(nums[j] ==4)
					{
						if(i < j)
						{
							last4 = i+1;  
						}
						else
						{
							last4 = j+1;
						}

						int aux = nums[i+1];
						nums[i+1] = nums[j];
						nums[j] = aux;
						break;
					}
				}
			}
		}
		return nums;
	}


	public static int[] fix45(int[] nums) {
		for(int i = 0; i<nums.length - 1; i++)
		{
			if(nums[i] == 4)
			{
				for(int j = 0; j < nums.length; j ++)
				{
					if(nums[j] == 5)
					{
						if(j == 0)
						{
							int aux = nums[i+1];
							nums[i+1] = nums[j];
							nums[j] = aux;
							break;
						}
						else if(nums[j - 1] != 4)
						{

							int aux = nums[i+1];
							nums[i+1] = nums[j];
							nums[j] = aux;
							break;
						}
					}

				}
			}
		}
		return nums;
	}


	public int functiesuma(int[] elemente, int start, int end)
	{
		int suma = 0;
		for(int i = start; i<end; i++  )
		{
			suma += elemente[i];
		}
		return suma;
	}

	public static boolean linearIn(int[] outer, int[] inner) {
		int count = 0;
		for(int i = 0; i<inner.length; i++)
		{
			for(int j = 0; j<outer.length; j++)
			{
				if(inner[i] == outer[j])
				{
					count ++;
					break;
				}
			}
		}

		return count == inner.length;
	}


	public static int maxMirror(int[] nums) {
		int count = 0;
		for( int i = 0; i<nums.length; i++)
		{
			for(int j = nums.length-1; j>=i; j--)
			{
				if (nums[i] == nums[j])
				{
					count++;
				}
			}
		}
		return count;
	}

	public static int countClumps(int[] nums) {
		int count = 0;
		boolean potrivire = false;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == nums[i+1] && !potrivire)
			{
				potrivire = true;
				count ++;
			}
			if(nums[i] != nums[i+1])
			{
				potrivire = false;
			}
		}
		return count;
	}



	static void testXyzMiddle()
	{
		String test1 = "xyzxyzAxyzxyzxyz";
		String test2 = "xyzxyzxyzBxyzxyz";
		String test3 = "AxyzBBB";
		String test4 = "AAAxyzBB";

		System.out.println("Test 1: " + test1);
		System.out.println("Asteptam true. Rezultat= " + xyzMiddle(test1));
		System.out.println("===================================");
		System.out.println("Test 2: " + test2);
		System.out.println("Asteptam true. Rezultat= " + xyzMiddle(test2));
		System.out.println("===================================");

		System.out.println("Test 3: " + test3);
		System.out.println("Asteptam false. Rezultat= " + xyzMiddle(test3));
		System.out.println("===================================");

		System.out.println("Test 4: " + test4);
		System.out.println("Asteptam true. Rezultat= " + xyzMiddle(test4));
	}

	public static String getSandwich(String str) {
		if(str.contains("bread") == false)
		{
			return "";
		}
		int index = str.indexOf("bread");
		int index2 = str.lastIndexOf("bread");
		if(index == index2)
		{
			return "";
		}
		String mijloc = str.substring(index + 5, index2);
		return mijloc;
	}

	public static void testSandwich()
	{
		String test1 = "breadjambread";

		System.out.println("Expected jam");
		System.out.println("Got " + getSandwich(test1));

	}
	public static boolean sameStarChar(String str) {
		if(str.contains("*") == false)
		{
			return true;
		}
		for(int i = 0; i < str.length()-1; i++)
		{
			if(str.charAt(i) == '*' && i >=1) {
				if( str.charAt(i-1) != str.charAt(i+1)) {
					return false;
				}
			}
		}
		return true;





	}

	public static void testSteluta(String test, boolean expected)
	{
		System.out.println("Test		:" + test);
		System.out.println("Expected	: " + expected);
		System.out.println("Got		: " + sameStarChar(test));
		System.out.println();
	}

	public static void doTestSteluta()
	{
		String test1 = "xy*yzz";
		String test2 = "xy*zzz";
		String test3 = "*xa*az";
		String test4 = "*xa*bz";
		String test5 = "*xa*a*b";
		String test7 = "12*2*3*";


		testSteluta(test1, true);
		testSteluta(test2, false);
		testSteluta(test3, true);
		testSteluta(test4, false);
		testSteluta(test5, false);
		testSteluta(test7, false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(noTeenSum(2, 13, 1));
		//		
		//		Map<String,String> teste = Map.ofEntries(
		//				entry("abc", "bca"),
		//				entry("tca", "cat"),
		//				entry("tcagdo", "catdog"),
		//				entry("chocolate", "hocolctea"),
		//				entry("1234567890", "231564897"));
		//		
		//		for (String test : teste.keySet()) {
		//			String rezultat = oneTwo(test);
		//			String expected = teste.get(test);
		//			if(rezultat.equals(expected))
		//			{
		//				System.out.println("Bravo, Liviule!");
		//			}
		//			else
		//			{
		//				System.out.println("Liviule, avem o problema!");
		//				System.out.println("Test    : " + test);
		//				System.out.println("Expected: " + expected);
		//				System.out.println("Got     : " + rezultat);
		//				System.out.println("\n==============================================\n");
		//				
		//			}
		//		}
		//		System.err.println(starOut("sm*abc*abc*il****ly"));
		//	}
		//	
		//	public static String oneTwo(String str) {
		//		  String rezultat = "";
		//		  for(int i = 0; i < str.length(); i += 3)
		//		  {
		//			  if(str.substring(i).length() / 3 >= 1 )
		//			  {
		//				  rezultat = rezultat + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i); 
		//				  
		//			  }
		//			  else
		//			  {
		//				  System.out.println("am ajuns la sfarsitul stringului.Mai pun " + str.substring(i) );
		////				rezultat = rezultat + str.substring(i);
		//				break;
		//			  }
		//				
		//		  }
		//		    
		//		  return rezultat;
	}


	public static String starOut(String str) {
		String rezultat = "";
		boolean amIntalnitSteluta = false;
		int indiceSteluta = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != '*' && amIntalnitSteluta == false )
			{
				rezultat = rezultat + str.charAt(i);

			}

			if(str.charAt(i) == '*')
			{
				amIntalnitSteluta = true;
				rezultat = str.substring(0, i-1);
				indiceSteluta = i;
			}

			if(indiceSteluta != i)
			{
				amIntalnitSteluta = false;
			}
		}
		return rezultat;
	}



	public static String zipZap(String str) {

		String rezultat = "";
		for(int i = 0; i < str.length(); i++ )
		{
			if(i< str.length()-2 && str.charAt(i)== 'z' && str.charAt(i + 2) == 'p')
			{
				rezultat = rezultat + str.charAt(i) + str.charAt(i + 2);
				i = i+2;
			}
			else
			{
				rezultat = rezultat + str.charAt(i);
			}
		}
		return rezultat;



	}




}
