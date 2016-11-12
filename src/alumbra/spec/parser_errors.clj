(ns alumbra.spec.parser-errors
  (:require [clojure.spec :as s]
            [alumbra.spec common]))

(s/def :alumbra/parser-errors
  (s/coll-of :alumbra/parser-error
             :min-count 1
             :gen-max 1))

(s/def :alumbra/parser-error
  (s/keys :req [:alumbra/location
                :alumbra/parser-error-message]))

(s/def :alumbra/parser-error-message
  string?)