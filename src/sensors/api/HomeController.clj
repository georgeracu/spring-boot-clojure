(ns sensors.api.HomeController
  (:import
    [org.springframework.web.bind.annotation RestController RequestMapping])
  (:gen-class
    :name ^{org.springframework.web.bind.annotation.RestController {}} sensors.api.HomeController
    :methods [
              [^{org.springframework.web.bind.annotation.RequestMapping ["/hello"]} hello [] String]
              ]))

(defn -hello [this] "Hello World!")