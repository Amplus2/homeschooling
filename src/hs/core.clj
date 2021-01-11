(ns hs.core
  (:gen-class))

(defn -main
  "I don't understand clj a whole lot ... yet."
  [& args]
  (def f (clojure.java.io/file "."))
  (println (file-seq f)))
