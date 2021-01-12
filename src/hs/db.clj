(ns hs.db
  (:gen-class))

(defn dir->db [dir]
  "Builds a new db from dir."
  (apply merge (map
    (fn [f] {(. f getAbsolutePath) (. f lastModified)})
    (file-seq (clojure.java.io/file dir)))))

(defn file->db [path]
  "Loads a db from path."
  (clojure.edn/read-string (slurp path)))

(defn db->file [path db]
  "Saves db to path."
  (spit path db))

(defn delta [d1 d2]
  "Gives you all of the files in d2 that were changed since d1."
  (remove (fn [k] (and (contains? d1 k) (= (get d1 k) (get d2 k)))) (keys d2)))
