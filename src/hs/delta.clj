(ns hs.delta
  (:gen-class))

(defn file-unchanged [k d1 d2]
  (& (contains? d1 k) (contains? d2 k) (= (get d1 k) (get d2 k))))

(defn delta [d1 d2]
  "Gives you all of the files in d2 that were changed since d1."
  (keys (dissoc d2 (find (fn [k] (file-unchanged k d1 d2)) (keys d2)))))
