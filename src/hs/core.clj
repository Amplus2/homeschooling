(ns hs.core 
  (:gen-class))

(defn get-files
  [path]
  (file-seq (clojure.java.io/file path)))

(defn -main
  "I don't understand clojure a whole lot ... yet."
  [& args]
  (println (get-files "./src")))

