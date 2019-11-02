package foobar.tool.toolkit.command;

import foobar.tool.toolkit.ToolKit;

import java.awt.*;
import java.util.Stack;

public class ToolKitCommand implements Command {
    private static Stack<ToolKitCommand> commandStack;//命令栈
    private static Stack<Memento> mementoStack;//备忘录栈

    private MementoReceiver receiver;//接受指令者

    ToolKitCommand(MementoReceiver receiver){
        this.receiver = receiver;
    }

    public MementoReceiver getMementoReceiver() {
        return receiver;
    }

    public static void Undo(){//对栈顶命令执行取消操作
        if(commandStack.empty()){
            System.out.println("亲，已经没有指令了呢。");
            return;
        }
        ToolKitCommand undoCommand = commandStack.pop();
        Memento undoMemento = mementoStack.pop();
        undoCommand.getMementoReceiver().reinstallMemento(undoMemento);
    }

    public static void Redo(){//重新执行栈顶命令
        if(commandStack.empty()){
            System.out.println("亲，没有指令可以重新执行呢。");
            return;
        }
        ToolKitCommand redoCommand = commandStack.peek();
        redoCommand.execute();
    }

    @Override
    public void execute() {//命令执行，调用接受者的动作函数
        mementoStack.push(receiver.createMemento());
        commandStack.push(this);
        receiver.action();
    }
}
