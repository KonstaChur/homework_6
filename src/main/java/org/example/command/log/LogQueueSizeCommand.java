package org.example.command.log;


import org.example.command.Command;
import org.example.queue.LinkedListCommandQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogQueueSizeCommand implements Command {
    private static final Logger log = LoggerFactory.getLogger(LogQueueSizeCommand.class);

    @Override
    public void execute() {
        var queue = LinkedListCommandQueue.getInstance();
        log.info("Queue size: {}", queue.size());
    }
}
