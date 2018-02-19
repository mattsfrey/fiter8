(ns fiter8.components.ui
  (:require [com.stuartsierra.component :as component]
            [fiter8.core :refer [render]]))

(defrecord UIComponent []
  component/Lifecycle
  (start [component]
    (render)
    component)
  (stop [component]
    component))

(defn new-ui-component []
  (map->UIComponent {}))
