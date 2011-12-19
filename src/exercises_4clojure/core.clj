(ns exercises-4clojure.core)

;; 21
(defn nth-element-solution [l n]
  (first (drop n l)))


;; 20
(defn penultimate-element-solution [l] 
  (second (reverse l)))


;; 34
;; Write a function which creates a list of all integers in a given range.
(defn implement-range-solution [b e]
  (range b e))


;; 27
;; Write a function which returns true if the given sequence is a palindrome.
(defn palindrome-detector-solution [s]
  (= (seq s) (reverse s)))


;; 32
;; Write a function which duplicates each element of a sequence.
(defn duplicate-a-sequence-solution [s]
  (mapcat #(repeat 2 %) s))


;; 42
;; Write a function which calculates factorials.
(defn factorial-fun-solution [x]
  (apply * (for [x (range 1 (inc x))]
             x)))
