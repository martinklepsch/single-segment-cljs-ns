(set-env!
 :source-paths   #{"src"}
 :resource-paths #{"html"}
 :dependencies '[[adzerk/boot-cljs      "0.0-2760-0" :scope "test"]
                 [adzerk/boot-cljs-repl "0.1.8"      :scope "test"]
                 [pandeiro/boot-http    "0.6.1"      :scope "test"]
                 [org.omcljs/om "0.8.6"]])

(require
 '[adzerk.boot-cljs      :refer [cljs]]
 '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
 '[pandeiro.boot-http    :refer [serve]])

(deftask dev
	"Recompile cljs code and serve it on port 3000"
	[]
	(comp
   (serve)
   (watch)
   (speak)
   (cljs :source-maps true
         :optimizations :none)))
