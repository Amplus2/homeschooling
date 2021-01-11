(ns hs.db
  (:gen-class))

(defn path->db [path]
  (apply merge (map
    (fn [f] {(. f getAbsolutePath) (. f lastModified)})
    (file-seq (clojure.java.io/file path)))))

(defn delta [d1 d2]
  "Gives you all of the files in d2 that were changed since d1."
  (remove (fn [k] (and (contains? d1 k) (= (get d1 k) (get d2 k)))) (keys d2)))
