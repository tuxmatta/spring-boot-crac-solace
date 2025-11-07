package com.example.spring_boot_crac_solace;

import org.springframework.stereotype.Controller;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@Controller("consumer")
public class SimpleSolaceConsumer implements Consumer<Message<byte[]>> {

    @Override
    public void accept(Message<byte[]> message){
        message.getHeaders().forEach((s,v)->
            System.out.println(String.format("[%s] %s", s, v))
        );
        System.out.println(message.getPayload());
    }
}
