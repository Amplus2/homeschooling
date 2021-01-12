(ns hs.core 
  (:gen-class))

(require 'hs.db)

(defn -main
  "I don't understand clojure a whole lot ... yet."
  [& args]
  (println (hs.db/dir->db "./src")))
