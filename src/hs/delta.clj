(ns hs.delta
  (:gen-class))

(defn delta [d1 d2]
  "Gives you all of the files in d2 that were changed since d1."
  (remove (fn [k] (& (contains? d1 k) (= (get d1 k) (get d2 k)))) (keys d2)))
