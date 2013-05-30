(defproject d3spike "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [ring "1.1.8"]
                 [ring/ring-json "0.2.0"]
                 [cheshire "5.2.0"]
                 [org.clojure/data.csv "0.1.2"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {
         :handler d3spike.core/app
         }
  :profiles {:dev {:dependencies [[midje "1.5.1"]]}})
  
