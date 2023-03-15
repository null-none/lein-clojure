(defproject lein-clojure "0.1.0-SNAPSHOT"
  :description "Quick run through of clojure, ring, and docker"
  :url "https://github.com/null-none/lein-clojure"
  :license {:name "MIT"
            :url "https://opensource.org/license/mit/"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring/ring-devel "1.1.8"]
                 [ring/ring-core "1.1.8"]
                 [ring/ring-json "0.3.1"]
                 [cheshire "5.5.0"]
                 [http-kit "2.6.0"]]
  :main lein-clojure.core)
