import java.util.Random;
class EvenThread extends Thread{
private int num;
public EvenThread(int num) {
this.num = num; }
public void run(){
System.out.println("Square of "+ num+" = "+num*num);
}}
class OddThread extends Thread{
private int num;
public OddThread(int num){
this.num = num;
}
public void run(){
System.out.println("Cube of "+num+" = "+ num*num*num);
}}
class RandomThread extends Thread{
public void run(){
Random r = new Random();
for(int i =0;i<10;i++){
int num = r.nextInt(100);
if(num % 2 == 0){
new EvenThread(num).start();
} else{
new OddThread(num).start();
}
}
}}
class MultiThread{
public static void main(String args[]){
RandomThread r = new RandomThread();
r.start();
}}
/*OUTPUT
Square of 46 = 2116
Cube of 1 = 1
Square of 0 = 0
Square of 58 = 3364
Cube of 17 = 4913
Cube of 51 = 132651
Square of 80 = 6400
Square of 40 = 1600
Cube of 45 = 91125
Cube of 17 = 4913
 */

