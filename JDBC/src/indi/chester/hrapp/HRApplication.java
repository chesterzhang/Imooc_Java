package indi.chester.hrapp;

import java.util.Scanner;

//实现按部门查询员工功能
public class HRApplication {

    public static void main(String[] args) {
        System.out.println("1-查询部门员工");
        System.out.println("2-办理员工入职");
        System.out.println("3-跟新员工工资");
        System.out.println("4-删除员工资料");
        System.out.println("5-分页查询员工数据");
        System.out.println("请选择功能: ");

        Scanner sc= new Scanner(System.in);
        Integer cmd= sc.nextInt();

        Command command=null;

        switch (cmd){
            case 1://查询员工
                command= new QueryCommand();
                command.execute();
                break;

            case 2:
                command= new InsertCommand();
                command.execute();
                break;

            case 3:
                command= new UpdateCommand();
                command.execute();
                break;

            case 4:
                command= new DeleteCommand();
                command.execute();
                break;

            case 5:
                command= new PaginationCommand();
                command.execute();
                break;

        }

    }



}
