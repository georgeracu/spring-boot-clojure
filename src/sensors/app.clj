(ns sensors.app
  (:import
    [org.springframework.context ApplicationContext]
    (org.springframework.boot SpringApplication))
  (:gen-class
    :name ^{org.springframework.boot.autoconfigure.SpringBootApplication {}} sensors.App))


(defn -main [& args]
  (let [^ApplicationContext ctx (SpringApplication/run
                                  ^Object sensors.App
                                  ^"[Ljava.lang.String;" (into-array String args))]))