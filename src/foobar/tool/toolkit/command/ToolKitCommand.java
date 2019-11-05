package foobar.tool.toolkit.command;

import foobar.tool.toolkit.ToolKit;

import java.awt.*;
import java.util.Stack;
import logger.logger;
public class ToolKitCommand implements Command {
    private static Stack<Command> commandStack = new Stack<Command>();//命令栈
    private static Stack<Memento> mementoStack = new Stack<Memento>();//备忘录栈

    private MementoReceiver receiver;//接受指令者

    public ToolKitCommand(MementoReceiver receiver){
        this.receiver = receiver;
    }

    public MementoReceiver getMementoReceiver() {
        return receiver;
    }

    public static void undo(){//对栈顶命令执行取消操作
        if(commandStack.empty()){
            logger.println(
                    "My dear，no command left"+
                    "method:undo");
            return;
        }
        ToolKitCommand undoCommand = (ToolKitCommand)commandStack.pop();
        Memento undoMemento = mementoStack.pop();
        undoCommand.getMementoReceiver().reinstallMemento(undoMemento);
    }

    public static void redo(){//重新执行栈顶命令
        if(commandStack.empty()){
            logger.println(
                    "My dear，no command can be redo"+
                    "method:redo");
            return;
        }
        ToolKitCommand redoCommand = (ToolKitCommand)commandStack.peek();
        redoCommand.execute();
    }

    @Override
    public void execute() {//命令执行，调用接受者的动作函数
        mementoStack.push(receiver.createMemento());
        commandStack.push(this);
        receiver.action();
        logger.println(
                "Upgrade success!"+
                "method:execute");
    }
}
