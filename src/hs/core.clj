(ns hs.core 
  (:gen-class))

(require '(hs [db :as db]))

(defn -main
  "I don't understand clojure a whole lot ... yet."
  [& args]
  (println (hs.db/path->db "./src")))
