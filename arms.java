public class Armstrong
{
public static void main(String args[])
{
int low=999,high=99999,num;
for(int num=low+1;num<high;++num)
{
if(checkArmstrong(number))
System.out.println(num + " ");
}
}
public static boolean checkArmstrong(int num)
{
int dig=0;
int res=0;
int org=num;
while(org!=0)
{
org=org/10;
++dig;
}
org=num;
while(org!=0)
{
int rem=org%10;
res=res+Math.pow(rem,dig);
org=org/10;
}
if(res==num)
return true;
return false;
}
}

