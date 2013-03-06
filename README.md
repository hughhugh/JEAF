## JEAF concept

The JAVA Evolutionary Algorithm Framework (JEAF) is a collection of JAVA libraries developed in the Integrated Group for Engineering Research (GII) containing several evolutionary algorithms, real-parameter benchmark functions and analysis tools that can be applied in evolutionary computation R&D. This framework is intensively used by the researchers of the GII and, consequently, it is in continuous improvement and extension.

It was born as a response to the lack of a free general library for evolutionary algorithms in JAVA that can be directly used by researchers or modified and extended favoured by the object-oriented design.

* JEAF concept
  * [Main properties](#main_properties)
  * Main sections
    * [Downloads](#downloads)
      * [Documentation](#documentation)
        * [Algorithm Characterization](#algorithm_characterization)
          * [Contributions](#contributions)
            * [Contact](#contact)
            
            <a name="main_properties"/>
            ### Main properties
            
            The main properties of JEAF are the following:
            
            * **Multiplatform:** JEAF is implemented in Java, so it can be used on any hardware platform where a Java Virtual Machine (JVM) exists without any change. The required version is 1.5 or higher, as generics, autoboxing and other recent features are used.
            * **Modular:** the design is profoundly object oriented, maintaining the maximum possible independence between the different components, so that a given component implementation / behavior does not affect the other components.
            * **Flexible:** this feature, related with the previous one, is present in every system piece. JEAF was designed not only to support current evolutionary algorithms, but also whatever combination of operators a given user could imagine. Thus, future evolutionary algorithms can be implemented without forcing them to fit into a classical evolutionary algorithm structure and without re-implementing existing components. In fact, it facilitates reusing them.  This is achieved by splitting the general concept of evolutionary algorithm into four stages (selection, reproduction, evaluation and replacement) and implementing each stage with an operator chain of arbitrary length. Length 1 or 2 is the most common situation, but every positive integer value is possible, 0 included, as long as interfaces are respected. In addition, many aspects of the already implemented common operators can also be configured with plug-ins, which is a more powerful mechanism than a predefined list of values. Of course, the user can also use this mechanism when implementing new operators.
            * **Efficiency:** it was taken into account from the very beginning. Evolutionary algorithms are time consuming, especially if they are applied to some engineering field, and the choice of Java already has a negative impact if we compare that language to C or C++. So, some decisions were carefully taken to maximize the efficiency of the implementation (for instance, chromosomes are arrays of doubles always in the [-1:1] range)
            * **Easy-to-use:** taking into account that JEAF was going to be used by other researchers who do not belong to computer science area, it was designed so that users do not need to know its inner working, only the global behavior and the holes that have to be filled for solving a particular problem. 
            * **Analysis tools:** besides different evolutionary algorithms and benchmark functions, this framework provides several analysis tools and support to implement even more. These tools are developed with the aim of facilitating the comparison of results using different algorithms or different versions of the same algorithm. Evolutionary algorithm analysis tools and function analysis tools are included.
            * **Distributed processing supported:** JEAF supports a very flexible distribution model for the evolution process, using MPI as the communication protocol (again, efficiency had something to do with this decision). Several models are supported (master-slave, islands…) with different topologies (grid, ring…) and ways of exchanging genetic material. The models supported can also be combined to create hybrid distribution schemes that adapt to the particular problem and / or hardware availability.
            
            
