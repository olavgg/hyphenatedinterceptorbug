package hyphenatedinterceptorbug

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class LogEnvSwitchInterceptorSpec extends Specification implements InterceptorUnitTest<LogEnvSwitchInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test logEnvSwitch interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"logEnvSwitch")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
