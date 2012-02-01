(ns exercises-4clojure.core)

;; 20
(defn penultimate-element-solution [l] 
  (second (reverse l)))


;; 21
(defn nth-element-solution [l n]
  (first (drop n l)))


;; 22
;; Write a function which returns the total number of elements in a
;; sequence.
(defn count-a-sequence-solution [s]
  (reduce + (map (fn [x] (+ 1)) s)))


;; 27
;; Write a function which returns true if the given sequence is a
;; palindrome.
(defn palindrome-detector-solution [s]
  (= (seq s) (reverse s)))


;; TODO 28
;; Write a function which flattens a sequence.
(defn flatten-a-sequence-solution [s]
  (flatten s))


;; 29
;; Write a function which takes a string and returns a new string
;; containing only the capital letters.
(defn get-the-caps-solution [s]
  (reduce str
         (re-seq #"[A-Z]" s)))


;; 32
;; Write a function which duplicates each element of a sequence.
(defn duplicate-a-sequence-solution [s]
  (mapcat #(repeat 2 %) s))


;; 33
;; Write a function which replicates each element of a sequence a
;; variable number of times.
(defn replicate-a-sequence-solution [s x]
  (mapcat #(repeat x %) s))


;; 34
;; Write a function which creates a list of all integers in a given
;; range.
(defn
 ^{:doc "Implement range with base functions"}
 implement-range-solution [b e]
 "Get a sequence of numbers starting with b and ending with e."
  (if  (= b e)
    nil
    (cons b (implement-range-solution (inc b) e))))


;; 38
;; Write a function which takes a variable number of parameters and
;; returns the maximum value.
(defn maximum-value-solution
  ([& r]
     (reduce #(if (> %2 %1) %2 %1) r)))
 

;; TODO 39
;; Write a function which takes two sequences and returns the first
;; item from each, then the second item from each, then the third,
;; etc.
(defn interleave-two-seqs-solution [s1 s2] ; Update args as needed!
  (interleave s1 s2))


;; TODO 40
;; Write a function which separates the items of a sequence by an
;; arbitrary value.
(defn interpose-a-seq-solution [x s] ; Update args as needed!
  (interpose x s))


;; 42
;; Write a function which calculates factorials.
(defn factorial-fun-solution [x]
  (reduce * (range 1 (inc x))))
