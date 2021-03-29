(def SPRING-BOOT-VERSION "2.4.4")

;; build: lein clean && lein spring-boot-jar
;; run: java -jar target/sensors-api.jar


(defproject sensors-api "0.1.0-SNAPSHOT"
  :description "RESTful API with Spring Boot"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.springframework.boot/spring-boot-starter-web ~SPRING-BOOT-VERSION
                  :exclusions [org.springframework.boot/spring-boot-starter-tomcat]]
                 [org.springframework.boot/spring-boot-starter-jetty ~SPRING-BOOT-VERSION]
                 [org.springframework.boot/spring-boot-starter-actuator ~SPRING-BOOT-VERSION]]
  :plugins [[lein-spring-boot-jar "0.1.0"]
            [lein-ancient "0.6.15"]]
  :repositories [["spring-milestone" "https://repo.spring.io/milestone"]]
  :main sensors.App
  :spring-boot-loader-version ~SPRING-BOOT-VERSION
  :aliases {"build" ["do" ["clean"] ["spring-boot-jar"]]}
  :aot :all)
