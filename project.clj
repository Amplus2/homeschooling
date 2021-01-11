(defproject hs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "MPL-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot hs.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
