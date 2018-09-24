public class Armstrong
{
public static void main(String args[])
{
int num=371,org,rem,res=0;
org=num;
while(org!=0)
{
rem=org%10;
res=res+Math.pow(rem,3);
org=org/10;
}
if(res==num)
{
System.out.println(num +"is an armstrong number");
}
else
{
System.out.println(num + "is not an armstrong number");
}
