<script>
  import Model from "../Templates/Model.svelte";
  export let isInCreate;
  /**
   * @type {string | number}
   */
  let valid;
</script>

<Model name="Create User">
  <div class="flex flex-col gap-6">
    <div class="flex items-baseline justify-end gap-4">
      <div class=" font-semibold">Name</div>
      <input
        class="outline-none w-2/3 border-b-[2px] border-blue-400"
        type="text"
        name="name"
      />
    </div>
    <div class="flex items-baseline justify-end gap-4">
      <div class=" font-semibold">Image URL</div>
      <input
        class="outline-none w-2/3 border-b-[2px] border-blue-400"
        type="text"
        name="Image"
      />
    </div>
  </div>
  <div class="flex items-baseline justify-between pl-3">
    <button
      class="text-blue-700 font-semibold text-md"
      on:click={() => {
        isInCreate = false;
      }}>Choose User</button
    >
    <button
      class={`px-2 py-1 mt-2 text-white font-semibold rounded-lg transition-all text-lg ${
        valid === -1
          ? "bg-gray-400"
          : "bg-blue-700 hover:brightness-110 active:scale-95"
      }`}
      disabled={valid === -1}
      on:click={() => {}}>Create</button
    >
  </div>
</Model>
