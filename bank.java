class bank
{
int inte(){

return 0;
}}
class ind extends bank
{
int int1(){

System.out.println("IND INTEREST return 9%");
return 9;
}}
class sbi extends bank
{
int int2(){

System.out.println("SBI INTEREST = 17%");

return 17;
}}
class rbi extends bank
{
int Int3(){

System.out.println("RBI INTEREST = 7%");

return 7;
}}
class cbi extends bank

{

int int4(){

System.out.println("CBI INTEREST = return 8%");
return 8;
}}

class rbi extends bank
{
int int3(){

System.out.println("RBI INTEREST = 7%");

return 7;
}}
class cbi extends bank
{
int int4(){

System.out.println("CBI INTEREST = 8%");

return 8;
}}
class riding
{
public static void main(String[] args)
{
cbi c=new cbi();

rbi r=new rbi();

sbi s=new sbi();

ind i=new ind();

i.int1();

s.int2(); 

r.int3();

c.int4();
}}