package indi.chester.preparedstatement;

public interface Command {
    //执行具体的SQL操作, 通过JDBC标准5步骤
    public void execute();
}
