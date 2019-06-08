package pluse;

public class pluse {

public int apluseb(int a ,int b ) {
	return a+b;
}
private int a ;
public pluse(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
public pluse() {
	super();
	// TODO Auto-generated constructor stub
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
@Override
public String toString() {
	return "pluse [a=" + a + ", b=" + b + "]";
}
private int b ;

}
