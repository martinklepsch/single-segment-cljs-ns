(defproject single-segment-testcase "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.omcljs/om "0.8.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]]

  :source-paths ["target/classes"]

  :clean-targets ["one-seg/out/main.js" "two-seg/out/main.js"]

  :cljsbuild {
    :builds [{:id "one-seg"
              :source-paths ["ssrc"]
              :compiler {
                :output-to "one-seg/out/main.js"
                :output-dir "one-seg/out"
                :main app
                :optimizations :none
                :cache-analysis true
                :source-map true}}
            {:id "two-seg"
              :source-paths ["src"]
              :compiler {
                :output-to "two-seg/out/main.js"
                :output-dir "two-seg/out"
                :main my.app
                :optimizations :none
                :cache-analysis true
                :source-map true}}]})
