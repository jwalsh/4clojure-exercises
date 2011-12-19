(ns exercises-4clojure.core)

;; 21
(defn nth-element-solution [l n]
  (first (drop n l)))


;; 20
(defn penultimate-element-solution [l] 
  (second (reverse l)))


;; 34
;; Write a function which creates a list of all integers in a given
;; range.
(defn implement-range-solution [b e]
  (range b e))


;; 27
;; Write a function which returns true if the given sequence is a
;; palindrome.
(defn palindrome-detector-solution [s]
  (= (seq s) (reverse s)))


;; 32
;; Write a function which duplicates each element of a sequence.
(defn duplicate-a-sequence-solution [s]
  (mapcat #(repeat 2 %) s))


;; 42
;; Write a function which calculates factorials.
(defn factorial-fun-solution [x]
  (reduce * (range 1 (inc x))))


;; 22
;; Write a function which returns the total number of elements in a
;; sequence.
(defn count-a-sequence-solution [s]
  (reduce + (map (fn [x] (+ 1)) s)))


;; 38
;; Write a function which takes a variable number of parameters and
;; returns the maximum value.
(defn maximum-value-solution [m & r]
  (reduce max m r))


;; 33
;; Write a function which replicates each element of a sequence a
;; variable number of times.
(defn replicate-a-sequence-solution [s x]
  (mapcat #(repeat x %) s))


;; 29
;; Write a function which takes a string and returns a new string
;; containing only the capital letters.
(defn get-the-caps-solution [s]
  (reduce str
         (re-seq #"[A-Z]" s)))

