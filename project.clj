(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.5.2"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [metosin/compojure-api "1.1.10"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.3"]
                 [expectations "2.2.0-beta1"]]
  :ring {:handler hello-world.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]
         :plugins [[lein-ring "0.9.7"]
                   [com.jakemccrary/lein-test-refresh "0.19.0"]]}})
