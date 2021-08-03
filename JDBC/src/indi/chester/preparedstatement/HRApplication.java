package indi.chester.preparedstatement;

import java.util.Scanner;

//实现按部门查询员工功能
public class HRApplication {

    public static void main(String[] args) {
        System.out.println("1-查询部门员工");
        Scanner sc= new Scanner(System.in);
        Integer cmd= sc.nextInt();

        switch (cmd){
            case 1://查询员工
                Command command= new PstmtQueryCommand();
                command.execute();
                break;

        }

    }



}
