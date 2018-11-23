package hyphenatedinterceptorbug


class LogEnvSwitchInterceptor {

    LogEnvSwitchInterceptor(){
        match(controller: "logEnvSwitch", action: "*")
    }

    boolean before() { 
        println "HELLO FROM LOG ENV SWITCH INTERCEPTOR"
        true 
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
