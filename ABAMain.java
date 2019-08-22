class A
{
	public int sum(int x, int y)
	{
	int z=0;
	z=x+y;
	return(z);
	}
	public int sub(int x, int y)
	{
	int z=0;
	z=x-y;
	return(z);
	}
	public int mul(int x, int y)
	{
	int z=0;
	z=x*y;
	return(z);
	}
}
class B extends A
{
	public void F1(int a, int b)
	{
	int r = sub(sum(mul(a,a),mul(b,b)),mul(2,mul(a,b)));
    System.out.println("Value of F1 is "+r);
	}
	public void F2(int a, int b)
	{
	int s=sub(mul(b,b),mul(4,mul(a,b)));
	System.out.println("Value of F2 is "+s);
	}
}

class ABAMain
{
	public static void main(String ab[])
	{
		int c,d;
		c=Integer.parseInt(ab[0]);
		d=Integer.parseInt(ab[1]);
	B ob = new B();
	ob.F1(c,d);
	ob.F2(c,d);
	}
}